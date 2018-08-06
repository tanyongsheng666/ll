package com.ll.service;

import com.ll.pojo.*;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 谭永生
 * @CreateDate: 2018/7/31 0031$ 19:24$
 * @UpdateUser: 谭永生
 * @UpdateDate: 2018/7/31 0031$ 19:24$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface IModelService {

/**
　　* @Description: TODO
　　* @param ${tags} 
　　* @return ${return_type} 
　　* @throws
　　* @author 谭永生
　　* @date 2018/8/2 14:41
　　*/
    List<Developer> querylist( Developer developer);

    List<Usert> queryuser(Integer id);

    List<Usert> queryusesr();

    List<Role> queryrole();

    List<Permissions> querypermiss();

    void addUserRole(UserRole userRole);

    void addRolePermiss(RolePermiss permiss);

    void RolePermissdelete(String roleid);

    void deleteUserRole(String userid);

    List<Role> queryroless(Integer id);


    Object querycar(int page, int rows, Car car);

    List<Car> querycarlist(int page, int rows);
}
