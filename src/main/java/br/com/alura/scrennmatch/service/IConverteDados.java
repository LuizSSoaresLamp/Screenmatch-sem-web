package br.com.alura.scrennmatch.service;

public interface IConverteDados {
  <T> T  obterDados(String Json, Class<T> classe);
}
