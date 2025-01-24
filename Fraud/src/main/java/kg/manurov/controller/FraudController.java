package kg.manurov.controller;

import kg.manurov.FraudCheckResponse;
import kg.manurov.services.FraudCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
public class FraudController {
    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
       Boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
       return new FraudCheckResponse(isFraudulentCustomer);
    }
}
