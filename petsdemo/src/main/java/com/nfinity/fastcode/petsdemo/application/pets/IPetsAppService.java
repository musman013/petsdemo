package com.nfinity.fastcode.petsdemo.application.pets;

import java.util.List;
import javax.validation.constraints.Positive;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.nfinity.fastcode.petsdemo.commons.search.SearchCriteria;
import com.nfinity.fastcode.petsdemo.application.pets.dto.*;

@Service
public interface IPetsAppService {

	CreatePetsOutput create(CreatePetsInput pets);

    void delete(Integer id);

    UpdatePetsOutput update(Integer id, UpdatePetsInput input);

    FindPetsByIdOutput findById(Integer id);

    List<FindPetsByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    
    //Types
    GetTypesOutput getTypes(Integer petsid);
    
    //Owners
    GetOwnersOutput getOwners(Integer petsid);
}
