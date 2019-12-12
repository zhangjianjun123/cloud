package pkq.com.bean;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String pwd;

    private String mm;

    private String hp;

    private String sex;

    private Integer age;

    public User() {
    }

    public User(Integer id, String name, String pwd, String mm, String hp, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.mm = mm;
        this.hp = hp;
        this.sex = sex;
        this.age = age;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return mm
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param mm
     */
    public void setMm(String mm) {
        this.mm = mm;
    }

    /**
     * @return hp
     */
    public String getHp() {
        return hp;
    }

    /**
     * @param hp
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}