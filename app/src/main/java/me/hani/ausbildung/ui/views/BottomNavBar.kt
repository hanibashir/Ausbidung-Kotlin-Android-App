package me.hani.ausbildung.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Category
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.List
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.hani.ausbildung.data.model.BottomNavItem

/**
 * Bottom bar contains navigation icons
 */

// list of the bottom navigation buttons
val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavItem(
        title = "All",
        icon = Icons.Rounded.List
    ),
    BottomNavItem(
        title = "Category",
        icon = Icons.Rounded.Category
    ),
    BottomNavItem(
        title = "General",
        icon = Icons.Rounded.Info
    )
)

@Preview
@Composable
fun BottomNavBarView() {

    NavigationBar {

        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {

            bottomNavItems.forEachIndexed { index, bottomNavItem ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = bottomNavItem.icon,
                            contentDescription = bottomNavItem.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = bottomNavItem.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}