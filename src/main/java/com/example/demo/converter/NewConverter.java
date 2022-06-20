package com.example.demo.converter;

import com.example.demo.dto.NewDTO;

import com.example.demo.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
    public NewEntity toEntity(NewDTO dto){
       NewEntity entity=new NewEntity();
       entity.setTitle(dto.getTitle());
       entity.setContent(dto.getContent());
       entity.setShortDescription(dto.getShortDescription());
       entity.setThumbnail(dto.getThumbnail());
        return entity;
    }
    public NewDTO toDTO(NewEntity entity){
        NewDTO dto =new NewDTO();
        if(Long.valueOf(entity.getId()) != null){
            dto.setId(entity.getId());
        }
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        dto.setThumbnail(entity.getThumbnail());
        dto.setCreatedDate(entity.getCreateDate());
        dto.setCreatedBy(entity.getCreateBy());
        dto.setModifiedDate(entity.getModifiedDate());
        dto.setModifiedBy(entity.getModifiedBy());
        return dto;
    }
    public NewEntity toEntity(NewDTO dto,NewEntity entity){
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        entity.setThumbnail(dto.getThumbnail());
        return entity;
    }
}
