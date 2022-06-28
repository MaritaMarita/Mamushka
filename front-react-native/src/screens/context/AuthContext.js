import axios from "axios";
import React, { createContext } from "react";
import { BASE_URL } from "../config";

export const AuthContext = createContext();

export const AuthProvider = ({children}) =>{
    const usuarios = (nombre, mail, password)=>{
        axios.post(`${BASE_URL}/usuarios`, {
            id,
            nombre,
            mail,
            password,
        })
        .then(res => {
            let userInfo = res.data;
            console.log(userInfo);
        })
        .catch(e =>{
            console.log(`usuarios error ${e}`);
        })
    };


    return(
    <AuthContext.Provider value={{usuarios}}>{children}</AuthContext.Provider>
    );
};