package CashController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CashService.CoinService;

import java.util.Map;

@RestController
@RequestMapping("/api/coins")
public class CoinController {
    @Autowired
    private CoinService coinService;

    @GetMapping("/latest")
    public ResponseEntity<Map<String, Object>> getCoinData(@RequestParam String symbols) {
        Map<String, Object> coinData = coinService.getCoinData(symbols);
        return ResponseEntity.ok(coinData);
    }
}
