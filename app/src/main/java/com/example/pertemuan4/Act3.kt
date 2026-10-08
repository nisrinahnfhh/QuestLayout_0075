package com.example.pertemuan4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AktivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.ca)
            )
        ) {
        }

        Row() {
            val gambar = painterResource(id = R.drawable.logoumy)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(100.dp).padding(all = 5.dp)
            )

            Spacer(modifier = Modifier.width(30.dp))
            Column() {
                Text(
                    stringResource("Nisrina Hanifah Ramadhani"),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive
                )
        }
        }


