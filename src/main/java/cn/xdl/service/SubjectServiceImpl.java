package cn.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.dao.SubjectDao;
import cn.xdl.pojo.Subject;
@Service
public class SubjectServiceImpl implements SubjectService {
    
	@Autowired
	private SubjectDao subjectDao;
	
	public List<Subject> loadSubject() {
		
		return subjectDao.findAll();
	}

}
