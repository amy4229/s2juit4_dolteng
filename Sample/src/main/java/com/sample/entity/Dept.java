package com.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;



@Entity
public class Dept {

    //@GeneratedValue
    @Id
    public Integer id;

    @Column(name="DEPT_NO")
    public Integer deptNo;

    @Column(name="DEPT_NAME")
    public String deptName;

    public String loc;

    @Version
    @Column(name="VERSION_NO")
    public Integer versionNo;

}