import React from "react";
import { Text, View, StyleSheet, Image, TextInput, TouchableOpacity, Button } from "react-native";
import image from './Images/sands.png';

const Inicio = () => {
    return(
        <View style={styles.container}>
            <Text style={styles.title}> Split & Smile </Text>
            <Image source={image} style={styles.image}
            />
            <Button title="Login"/>
            <View style={{flexDirection: 'row', marginTop:20}}>
                <Text>No tenes una cuenta? </Text>
                <TouchableOpacity>
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