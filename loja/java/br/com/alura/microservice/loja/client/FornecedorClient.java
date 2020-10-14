package br.com.alura.microservice.loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;
import br.com.alura.microservice.loja.controller.dto.InfoPeditoDTO;
import br.com.alura.microservice.loja.controller.dto.ItemDaCompraDTO;


/**
 * o Feing já é integrado com o Ribbon( client side load balancing)
 * com ele a implementação do cliente http rest fica bem mais simples,
 * para usar é preciso anotar no LojaApplication o @EnableFeignClients,
 * dessa forma o spring consegue injetar a dependencia do @FeignClient
 * @author ysmael
 *
 */

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	InfoPeditoDTO realizaPedido(List<ItemDaCompraDTO> itens);
}	
