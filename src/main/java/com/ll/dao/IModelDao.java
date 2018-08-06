package com.ll.dao;

import com.ll.pojo.*;

import org.apache.ibatis.annotations.*;


import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 谭永生
 * @CreateDate: 2018/7/31 0031$ 19:40$
 * @UpdateUser: 谭永生
 * @UpdateDate: 2018/7/31 0031$ 19:40$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Mapper
public interface IModelDao {
    @Select(" select * from lin_user where pid= #{id}  ")
    List<Usert> queryuser(Integer id);

    @Select(" select * from lin_user ")
    List<Usert> queryusesr();

    @Select(" select * from lin_role  ")
    List<Role> queryrole();

    @Select(" select * from lin_permissions  ")
    List<Permissions> querypermiss();

    @Insert("INSERT into lin_user_role(userid,roleid) values(#{userRole.userid},#{userRole.roleid}) ")
    void addUserRole(@Param("userRole") UserRole userRole);

    @Insert("INSERT into lin_role_permiss(roleid,Permissid) values(#{permiss.roleid},#{permiss.Permissid}) ")
    void addRolePermiss(@Param("permiss")RolePermiss permiss);

    @Delete(" delete from lin_user_role where userid in (${userid})")
    void delete(@Param("userid")String userid);

    @Delete(" delete from lin_role_permiss where userid in (${userid})")
    void RolePermissdelete(@Param("userid")String roleid);

    @Select(" select * from lin_user_role where userid = #{id} ")
    List<UserRole> queryroless(@Param("id") Integer id);



    @Select(" select * from t_car limit #{page},#{rows} ")
    List<Car> querycarlist(int page, int rows);

//    @Modifying
//    @Query("select  u from Usert u  where u.pid = :id")
//    List<Usert> queryuser(@Param("id") Integer id);



}
