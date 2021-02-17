package jskno.micro.msscbeerorderservice.services.beer;

import jskno.micro.msscbeerorderservice.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID id);

    Optional<BeerDto> getBeerByUpc(String upc);
}
