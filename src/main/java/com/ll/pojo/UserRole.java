package com.ll.pojo;

import org.springframework.boot.SpringBootConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description: java类作用描述
 * @Author: 谭永生
 * @CreateDate: 2018/8/1 0001$ 8:52$
 * @UpdateUser: 谭永生
 * @UpdateDate: 2018/8/1 0001$ 8:52$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootConfiguration
@Entity(name="lin_UserRole")
public class UserRole {
    @Id
    @GeneratedValue
    private Integer id;
    private String userid;
    private String roleid;

    public String getUserid() {
        return userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userid='" + userid + '\'' +
                ", roleid='" + roleid + '\'' +
                '}';
    }
}
