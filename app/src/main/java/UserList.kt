
    package com.example.projek_kartunama

    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.foundation.lazy.items
    import androidx.compose.runtime.Composable

    @Composable
    fun UserList(users: List<User>) {
        LazyColumn {
            items(users) { user ->
                UserCard(user = user)
            }
        }
    }

}