package cn.zhloong.service;

import cn.zhloong.mapper.AdminMapper;
import cn.zhloong.mapper.StudentMapper;
import cn.zhloong.mapper.TeacherMapper;
import cn.zhloong.pojo.Administrate;
import cn.zhloong.pojo.Student;
import cn.zhloong.pojo.Teacher;
import cn.zhloong.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    AdminMapper adminMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public boolean checkAdmin(String username, String password) {
        Administrate administrate = adminMapper.queryAdministrate(username);
        return administrate != null && administrate.getApass().equals(password);
    }

    @Override
    public boolean checkStudent(String username, String password) {
        Student student = studentMapper.queryStudent(username);
        return student != null && student.getSpass().equals(password);
    }

    @Override
    public boolean checkTeacher(String username, String password) {
        Teacher teacher = teacherMapper.queryTeacher(username);
        return teacher != null && teacher.getTpass().equals(password);
    }
}
