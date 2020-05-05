package cn.zhloong.service;

public interface LoginService {
    boolean checkAdmin(String username, String password);

    boolean checkStudent(String username, String password);

    boolean checkTeacher(String username, String password);
}
