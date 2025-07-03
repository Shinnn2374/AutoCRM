package com.example.AutoCRM.service;

import com.example.AutoCRM.dto.client.ClientRequestDto;
import com.example.AutoCRM.dto.client.ClientResponseDto;

import java.util.List;

public interface ClientService {

    List<ClientResponseDto> getAllClients();

    ClientResponseDto getClientById(Long id);

    ClientResponseDto createClient(ClientRequestDto clientRequestDto);

    ClientResponseDto updateClient(Long id, ClientRequestDto clientRequestDto);

    void deleteClient(Long id);
}
