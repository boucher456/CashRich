package CashService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinService {
	@Value("${coinmarketcap.api.key}")
	private String apiKey;

	public Map<String, Object> getCoinData(String symbols) {
		String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=" + symbols;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-CMC_PRO_API_KEY", apiKey);
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, entity, Map.class);
		return response.getBody();
	}
}
