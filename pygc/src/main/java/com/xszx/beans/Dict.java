package com.xszx.beans;

/**
 * @author Learning makes me happy.
 * @date 2023/2/14 16:42
 */
public class Dict {
    private int d_id;
    private String d_name;
    private String value;
    private int pid;

    public Dict() {
    }

    public Dict(int d_id, String d_name, String value, int pid) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.value = value;
        this.pid = pid;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", value='" + value + '\'' +
                ", pid=" + pid +
                '}';
    }
}
