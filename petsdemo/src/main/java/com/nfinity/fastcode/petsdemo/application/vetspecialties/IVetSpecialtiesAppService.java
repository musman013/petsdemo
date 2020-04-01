package com.nfinity.fastcode.petsdemo.application.vetspecialties;

import java.util.List;
import javax.validation.constraints.Positive;
import com.nfinity.fastcode.petsdemo.domain.model.VetSpecialtiesId;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.nfinity.fastcode.petsdemo.commons.search.SearchCriteria;
import com.nfinity.fastcode.petsdemo.application.vetspecialties.dto.*;

@Service
public interface IVetSpecialtiesAppService {

	CreateVetSpecialtiesOutput create(CreateVetSpecialtiesInput vetspecialties);

    void delete(VetSpecialtiesId vetSpecialtiesId);

    UpdateVetSpecialtiesOutput update(VetSpecialtiesId vetSpecialtiesId, UpdateVetSpecialtiesInput input);

    FindVetSpecialtiesByIdOutput findById(VetSpecialtiesId vetSpecialtiesId);

    List<FindVetSpecialtiesByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

	public VetSpecialtiesId parseVetSpecialtiesKey(String keysString);
    
    //Specialties
    GetSpecialtiesOutput getSpecialties(VetSpecialtiesId vetSpecialtiesId);
    
    //Vets
    GetVetsOutput getVets(VetSpecialtiesId vetSpecialtiesId);
}
