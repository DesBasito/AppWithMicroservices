package kg.manurov.controller;

import kg.manurov.FraudCheckResponse;
import kg.manurov.services.FraudCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
       Boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
       log.info("fraud check request for customer {}", customerId);
       return new FraudCheckResponse(isFraudulentCustomer);
    }
}
