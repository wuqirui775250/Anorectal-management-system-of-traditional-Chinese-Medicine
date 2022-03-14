package com.example.demo.untils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resultuntils
{
    Integer code;
    String msg;
    Object data;

    public static Resultuntils success(Object data)
    {
        return new Resultuntils(200,"success",data);
    }
    public static Resultuntils fail(Integer code,String msg)
    {
        return new Resultuntils(code,msg,null);
    }
}
