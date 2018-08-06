package com.ll.service.Impl;


import com.ll.dao.IModelDao;
import com.ll.pojo.*;
import com.ll.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 谭永生
 * @CreateDate: 2018/7/31 0031$ 19:24$
 * @UpdateUser: 谭永生
 * @UpdateDate: 2018/7/31 0031$ 19:24$zz
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class ModelServiceImpl implements IModelService{


    @Autowired
    private  IModelDao modelDao;



    @Override
    public List<Developer> querylist( Developer developer) {

        return null;
    }

    @Override
    public List<Usert> queryuser(Integer id) {

       /* List<Usert>  list=modelDao.queryuser(id);*/
        List<Usert> list= modelDao.queryuser(id);
        return list;
    }

    @Override
    public List<Usert> queryusesr() {
        List<Usert> list= modelDao.queryusesr();
        return list;
    }

    @Override
    public List<Role> queryrole() {
        List<Role> list= modelDao.queryrole();
        return list;
    }

    @Override
    public List<Permissions> querypermiss() {
        List<Permissions> list= modelDao.querypermiss();
        return list;
    }

    @Override
    public void addUserRole(UserRole userRole) {

        modelDao.addUserRole(userRole);

    }

    @Override
    public void addRolePermiss(RolePermiss permiss) {

        modelDao.addRolePermiss(permiss);
    }

    @Override
    public void RolePermissdelete(String roleid) {
        modelDao.RolePermissdelete(roleid);
    }

    @Override
    public void deleteUserRole(String userid) {
        modelDao.delete(userid);
    }

    @Override
    public List<Role> queryroless(Integer id) {
        List<Role> list= modelDao.queryrole();
        List<UserRole> list2= modelDao.queryroless(id);
        for (Role role : list) {
            for (UserRole role1 : list2) {
                if(role.getId().toString().equals(role1.getRoleid())){
                    role.setChecked(true);
                }
            }
        }
        return list;
    }

    @Override
    public Object querycar(int page, int rows, Car car) {
        return null;
    }

    @Override
    public List<Car> querycarlist(int page, int rows) {
        return modelDao.querycarlist(page,rows);
    }


}
