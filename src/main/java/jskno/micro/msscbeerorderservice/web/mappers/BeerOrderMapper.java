package jskno.micro.msscbeerorderservice.web.mappers;

import jskno.micro.msscbeerorderservice.domain.BeerOrder;
import jskno.micro.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class}, componentModel = "spring")
public interface BeerOrderMapper {

    @Mapping(target = "customerId", source = "customer.id")
    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
