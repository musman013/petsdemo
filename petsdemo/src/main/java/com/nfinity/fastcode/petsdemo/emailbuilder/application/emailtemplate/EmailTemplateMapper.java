package com.nfinity.fastcode.petsdemo.emailbuilder.application.emailtemplate;

import org.mapstruct.Mapper;

import com.nfinity.fastcode.petsdemo.emailbuilder.application.emailtemplate.dto.*;
import com.nfinity.fastcode.petsdemo.emailbuilder.domain.model.EmailTemplateEntity;

@Mapper(componentModel = "spring")
public interface EmailTemplateMapper {

    EmailTemplateEntity createEmailTemplateInputToEmailTemplateEntity(CreateEmailTemplateInput emailDto);

    CreateEmailTemplateOutput emailTemplateEntityToCreateEmailTemplateOutput(EmailTemplateEntity entity);

    EmailTemplateEntity updateEmailTemplateInputToEmailTemplateEntity(UpdateEmailTemplateInput emailDto);

    UpdateEmailTemplateOutput emailTemplateEntityToUpdateEmailTemplateOutput(EmailTemplateEntity entity);

    FindEmailTemplateByIdOutput emailTemplateEntityToFindEmailTemplateByIdOutput(EmailTemplateEntity entity);

    FindEmailTemplateByNameOutput emailTemplateEntityToFindEmailTemplateByNameOutput(EmailTemplateEntity entity);
}