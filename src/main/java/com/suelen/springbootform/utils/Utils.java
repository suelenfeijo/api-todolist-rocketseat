package com.suelen.springbootform.utils;
import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {
	//copia tudo que não for nulo , recebe dois parametros (source = de onde tá vindo , target= pra onde vai.)
	
  public static void copyNonNullProperties(Object source, Object target) {
	  //beanUtils -> copyProperties, copia os valores de um objeto pra um outro objeto
	  // e também pode no 3 parametro passa uma classe pra ser dita a regra usada
    BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
  }

  public static String[] getNullPropertyNames(Object source) {
    final BeanWrapper src = new BeanWrapperImpl(source);

    PropertyDescriptor[] pds = src.getPropertyDescriptors();

    
    Set<String> emptyNames = new HashSet<>();

    for (PropertyDescriptor pd : pds) {
      Object srcValue = src.getPropertyValue(pd.getName());
      if (srcValue == null) {
        emptyNames.add(pd.getName());
      }
    }
    //cria um array de string do tamanho de emptyNames
    String[] result = new String[emptyNames.size()];
    //retorna emptyNames convertido em array guardando valores de result
    return emptyNames.toArray(result);
  }
}