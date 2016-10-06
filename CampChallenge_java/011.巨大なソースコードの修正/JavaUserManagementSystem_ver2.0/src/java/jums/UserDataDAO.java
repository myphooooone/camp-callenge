package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する DB接続系はDBManagerクラスに一任 基本的にはやりたい1種類の動作に対して1メソッド
 *
 * @author hayashi-s
 */
public class UserDataDAO {

    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance() {
        return new UserDataDAO();
    }

    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     *
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー
     */
    public void insert(UserDataDTO ud) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DBManager.getConnection();
            st = con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate) VALUES(?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    /**
     * データの検索処理を行う。
     *
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー
     * @return 検索結果
     */
    public ArrayList<UserDataDTO> search(UserDataDTO ud) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DBManager.getConnection();

            //検索する際にエラーが出たので修正
            String sql = "SELECT * FROM user_t";
            boolean flag = false;
            if (!ud.getName().equals("")) {
                sql += " WHERE name like ";
                flag = true;
                sql += ("'%" + ud.getName() + "%'");
            }

             //検索する際にエラーが出たので修正
            if (ud.getBirthday() != null) {
                if (!flag) {
                    sql += " WHERE birthday like ";
                    flag = true;
                    sql += ("'%" + new SimpleDateFormat("yyyy").format(ud.getBirthday()) + "%'");
                } else {
                    sql += " AND birthday like ";
                    sql += ("'%" + new SimpleDateFormat("yyyy").format(ud.getBirthday()) + "%'");
                }
            }
             //検索する際にエラーが出たので修正
            if (ud.getType() != 0) {
                if (!flag) {
                    sql += " WHERE type like ";
                    sql += (ud.getType());
                } else {
                    sql += " AND type like ";
                    sql += (ud.getType());

                }
            }

            st = con.prepareStatement(sql);
            
            // ?マークで書いていなく、1,2,3が何の数字が認識出来ずプリントアウト
            //st.setString(1, "%"+ud.getName()+"%");
            //st.setString(2, "%"+ new SimpleDateFormat("yyyy").format(ud.getBirthday())+"%");
            //st.setInt(3, ud.getType());
            
            ResultSet rs = st.executeQuery();
            //全件検索表示にする為にArrayListを作成
            ArrayList<UserDataDTO> ary = new ArrayList<UserDataDTO>();
            //while文を使い全件表示
            while (rs.next()) {
                UserDataDTO resultUd = new UserDataDTO();

                resultUd.setUserID(rs.getInt(1));
                resultUd.setName(rs.getString(2));
                resultUd.setBirthday(rs.getDate(3));
                resultUd.setTell(rs.getString(4));
                resultUd.setType(rs.getInt(5));
                resultUd.setComment(rs.getString(6));
                resultUd.setNewDate(rs.getTimestamp(7));
                ary.add(resultUd);
                System.out.println("search completed");
            }
            //ArrayListの変数aryをリターン
            return ary;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     *
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー
     * @return 検索結果
     */
    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DBManager.getConnection();

            String sql = "SELECT * FROM user_t WHERE userID = ?";

            st = con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());

            ResultSet rs = st.executeQuery();
            rs.next();
            UserDataDTO resultUd = new UserDataDTO();
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));

            System.out.println("searchByID completed");

            return resultUd;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }
    //デリート機能の作成
public void Deleteresult(UserDataDTO udd) throws SQLException{
          
            Connection con = null;
            PreparedStatement st = null;
            
            try{
            con = DBManager.getConnection();
            st=con.prepareStatement("delete from user_t where userID = ?");
            st.setInt(1,udd.getUserID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
           if (con != null) {
              } con.close();
            }
            }

//アップデート機能の作成
public void Update(UserDataDTO udd) throws SQLException{
           
           Connection con = null;
           PreparedStatement st = null;

           try{
               con = DBManager.getConnection();
               st = con.prepareStatement("update user_t set name=?,birthday=?,type=?,tell=?,comment=? where userID=?");
               st.setString(1, udd.getName());
               st.setDate(2, new java.sql.Date(udd.getBirthday().getTime()));
               st.setInt(3, udd.getType());
               st.setString(4, udd.getTell());
               st.setString(5, udd.getComment());
               st.setInt(6,udd.getUserID());
               st.executeUpdate();
               } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
           if (con != null) {
              } con.close();
            }
            }
           }




