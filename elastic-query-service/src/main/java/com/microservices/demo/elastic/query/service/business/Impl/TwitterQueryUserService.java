package com.microservices.demo.elastic.query.service.business.Impl;

import com.microservices.demo.elastic.query.service.business.QueryUserService;
import com.microservices.demo.elastic.query.service.dataaccess.entity.UserPermission;
import com.microservices.demo.elastic.query.service.dataaccess.repository.UserPermissionRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TwitterQueryUserService implements QueryUserService {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterQueryUserService.class);

    private final UserPermissionRepository userPermissionRepository;

    @Override
    public Optional<List<UserPermission>> findAllPermissionsByUsername(String username) {
        LOG.info("Finding permissions by username: {}", username);
        return userPermissionRepository.findPermissionsByUsername(username);
    }
}
