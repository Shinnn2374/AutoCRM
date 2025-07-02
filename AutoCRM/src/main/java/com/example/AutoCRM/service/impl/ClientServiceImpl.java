package com.example.AutoCRM.service.impl;

import com.example.AutoCRM.dto.client.ClientRequestDto;
import com.example.AutoCRM.dto.client.ClientResponseDto;
import com.example.AutoCRM.exception.ClientNotFoundException;
import com.example.AutoCRM.model.Client;
import com.example.AutoCRM.repository.ClientRepository;
import com.example.AutoCRM.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public List<ClientResponseDto> getAllClients() {
        return clientRepository.findAll().stream()
                .map(Client::modelToDto).toList();
    }


    @Override
    public ClientResponseDto getClientById(Long id) {
        return clientRepository.findById(id).map(Client::modelToDto)
                .orElseThrow(() -> new ClientNotFoundException(MessageFormat.format("Client with id {0} not found", id)));
    }

    @Override
    public ClientResponseDto createClient(ClientRequestDto request) {
        var client = Client.builder()
                .id(System.currentTimeMillis())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email()
                .phone()
                .cars() 
                .build();

        return null;
    }

    @Override
    public ClientResponseDto updateClient(Long id, ClientRequestDto request) {
        return null;
    }

    @Override
    public ClientResponseDto deleteClient(Long id) {
        return null;
    }


}
