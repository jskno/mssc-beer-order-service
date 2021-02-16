package jskno.micro.msscbeerorderservice.repositories;

import jskno.micro.msscbeerorderservice.domain.BeerOrder;
import jskno.micro.msscbeerorderservice.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
