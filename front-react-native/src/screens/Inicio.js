import React from "react";
import { Text, View, StyleSheet, Image, TouchableOpacity, Button } from "react-native";
import image from './Images/sands.png';


const Inicio = ({navigation}) => {
    return(
        <View style={styles.container}>
            <Text style={styles.title}> Split & Smile </Text>
            <Image source={image} style={styles.image}
            />
            <Button onPress={() => navigation.navigate('Login')}title="Logueate"/>
            <View style={{flexDirection: 'row', marginTop:20}}>
                <Text>No tenes una cuenta? </Text>
                <TouchableOpacity onPress={() => navigation.navigate('Register')}>
                    <Text style={styles.link}>Registrate</Text>
                </TouchableOpacity>
            </View>
        </View>
    );
};

const styles = StyleSheet.create({
    container: { flex: 1, justifyContent: "center", alignItems: "center"},
    title: { fontSize: 30},
    image: {height: 90, width: 300},
    link: {color: 'blue',},

})

export default Inicio;