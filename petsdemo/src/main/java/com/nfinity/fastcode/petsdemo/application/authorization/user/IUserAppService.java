package com.nfinity.fastcode.petsdemo.application.authorization.user;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nfinity.fastcode.petsdemo.commons.search.SearchCriteria;
import com.nfinity.fastcode.petsdemo.application.authorization.user.dto.*;

import java.util.List;

@Service
public interface IUserAppService {

	CreateUserOutput create(CreateUserInput user);

    void delete(Long id);

    UpdateUserOutput update(Long userId, UpdateUserInput input);

    FindUserByIdOutput findById(Long id);

    List<FindUserByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

}
