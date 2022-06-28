import React from "react";
import { TextInput, View, StyleSheet, Button } from "react-native";

const Login = () => {
    return(
        <View style={styles.container}>
            <View>
                <TextInput style={styles.input} placeholder="Ingrese su Nombre de usuario"/>
                <TextInput style={styles.input} placeholder="Ingrese su contraseña" secureTextEntry/>

                <Button title="Login"/>
            </View>
        </View>
    );

};

const styles= StyleSheet.create({
    container: {
        flex: 1,
        alignItems:'center',
        justifyContent:'center',
    },
    wrapper:{
        width: '80%',
    },
    input:{
        marginBottom:12,
        borderWidth:1,
        borderColor: '#bbb',
        borderRadius: 5,
        paddingHorizontal:14,
    },
})

export default Login;