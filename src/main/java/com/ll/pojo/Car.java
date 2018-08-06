package com.ll.pojo;

import org.springframework.boot.SpringBootConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 谭永生
 * @Title: Car
 * @ProjectName ll
 * @Description: TODO
 * @date 2018/8/316:13
 */

@SpringBootConfiguration
@Entity(name="t_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private  Integer  cid;
     private   String  cname;
     private  String   cbrand;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cbrand='" + cbrand + '\'' +
                '}';
    }
}
