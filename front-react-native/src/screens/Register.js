import React, {useContext, useState} from "react";
import { TextInput, View, StyleSheet, Button, Text } from "react-native";
import { AuthContext } from "./context/AuthContext";

const Register = () => {
    const [nombre, setNombre] = useState(null);
    const [mail, setMail] = useState(null);
    const [password, setPassword] = useState(null);

    const {usuarios} = useContext(AuthContext);

    return(
        <View style={styles.container}>
            <View>
                <TextInput style={styles.input} value={nombre} placeholder="Ingrese su Nombre de usuario" onChangeText={text=> setNombre(text)}/>
                <TextInput style={styles.input} value={mail} placeholder="Ingrese su email" onChangeText={text=> setMail(text)} />
                <TextInput style={styles.input} value={password} placeholder="Ingrese su contraseña" secureTextEntry onChangeText={text=> setPassword(text)}/>
                <Button title="Registrarse" onPress={() => {usuarios(nombre, mail, password);}}/>
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

export default Register;