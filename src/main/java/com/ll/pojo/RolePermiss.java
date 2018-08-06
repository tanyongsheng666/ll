package com.ll.pojo;

import org.springframework.boot.SpringBootConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description: java类作用描述
 * @Author: 谭永生
 * @CreateDate: 2018/8/1 0001$ 8:54$
 * @UpdateUser: 谭永生
 * @UpdateDate: 2018/8/1 0001$ 8:54$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootConfiguration
@Entity(name="lin_role_permiss")
public class RolePermiss {
    @Id
    @GeneratedValue
    private Integer id;
    private String roleid;
    private String Permissid;

    public String getRoleid() {
        return roleid;
    }

    public String getPermissid() {
        return Permissid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public void setPermissid(String permissid) {
        Permissid = permissid;
    }

    @Override
    public String toString() {
        return "RolePermiss{" +
                "roleid='" + roleid + '\'' +
                ", Permissid='" + Permissid + '\'' +
                '}';
    }
}
