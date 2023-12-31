package ir.fum.oop.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestfulServiceVO implements Serializable {
    private String httpMethod;
    private List<String> inputs;
    private String route;
    private String returnType;
}
