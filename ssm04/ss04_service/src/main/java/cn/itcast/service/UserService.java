package cn.itcast.service;

import cn.itcast.domain.User;

public interface UserService {
    User findByUid(int uid);
}
