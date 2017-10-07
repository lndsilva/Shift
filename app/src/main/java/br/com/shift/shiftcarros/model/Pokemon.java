package br.com.shift.shiftcarros.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 07/10/2017.
 */

public class Pokemon {


    @SerializedName(value = "name")

    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
