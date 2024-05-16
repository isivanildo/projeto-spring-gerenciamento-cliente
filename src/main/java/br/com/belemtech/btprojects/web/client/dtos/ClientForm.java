package br.com.belemtech.btprojects.web.client.dtos;

import br.com.belemtech.btprojects.core.models.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public String cleanedPhone() {
        return phone.replaceAll("[^0-9]", "");
    }

    public Client toClient() {
        return Client.builder()
        .id(id)
        .name(name)
        .email(email)
        .phone(cleanedPhone())
        .build();
    }

}
