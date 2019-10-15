/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.clientminh.service;

public interface HelloWorld extends java.rmi.Remote {
    public com.example.clientminh.service.Employee findById(long arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorldFrom(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.example.clientminh.service.Employee addEmployees(com.example.clientminh.service.Employee arg0) throws java.rmi.RemoteException;
    public com.example.clientminh.service.Employee[] getEmployees() throws java.rmi.RemoteException;
    public com.example.clientminh.service.Employee updateEmployee(com.example.clientminh.service.Employee arg0) throws java.rmi.RemoteException;
}
