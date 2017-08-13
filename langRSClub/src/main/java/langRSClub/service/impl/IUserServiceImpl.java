package langRSClub.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import langRSClub.dao.UserMapper;
import langRSClub.entity.User;
import langRSClub.service.IUserService;
@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource  
    private UserMapper userDao;

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);  
	}  


}
