
    package com.example.projek_kartunama

    import androidx.compose.foundation.layout.*
    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.unit.dp

    @Composable
    fun UserCard(user: User) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = user.name, style = MaterialTheme.typography.titleLarge)
                Text(text = user.title, style = MaterialTheme.typography.bodyMedium)
                Text(text = user.email, style = MaterialTheme.typography.bodySmall)
            }
        }
    }

}