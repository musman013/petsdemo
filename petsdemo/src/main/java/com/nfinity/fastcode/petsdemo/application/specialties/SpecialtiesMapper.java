package com.nfinity.fastcode.petsdemo.application.specialties;

import org.mapstruct.Mapper;
import com.nfinity.fastcode.petsdemo.application.specialties.dto.*;
import com.nfinity.fastcode.petsdemo.domain.model.SpecialtiesEntity;

@Mapper(componentModel = "spring")
public interface SpecialtiesMapper {

   SpecialtiesEntity createSpecialtiesInputToSpecialtiesEntity(CreateSpecialtiesInput specialtiesDto);
   
   CreateSpecialtiesOutput specialtiesEntityToCreateSpecialtiesOutput(SpecialtiesEntity entity);

   SpecialtiesEntity updateSpecialtiesInputToSpecialtiesEntity(UpdateSpecialtiesInput specialtiesDto);

   UpdateSpecialtiesOutput specialtiesEntityToUpdateSpecialtiesOutput(SpecialtiesEntity entity);

   FindSpecialtiesByIdOutput specialtiesEntityToFindSpecialtiesByIdOutput(SpecialtiesEntity entity);


}
