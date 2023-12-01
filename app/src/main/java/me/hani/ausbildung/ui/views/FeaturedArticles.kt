package me.hani.ausbildung.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import me.hani.ausbildung.data.model.AusPage
import java.util.Date

val ausPages = listOf<AusPage>(
    AusPage(
        title = " متخصص في تكنولوجيا المعلومات",
        duration = "ثلاث سنوات ونصف",
        certificate = "الثانوية",
        content = "إنها سلسلة من الكلمات اللاتينية التي ، عند وضعها في موضعها ، لا تشكل جملًا بمعنى كامل ، ولكنها تعطي الحياة لنص اختبار مفيد لملء الفراغات التي يتم شغلها لاحقًا من نصوص مخصصة كتبها متخصصون في الاتصال.",
        categoryId = 1,
        userId = 1,
        shiftType = "دوام متغير",
        firstYearSalary = 800,
        secondYearSalary = 900,
        thirdYearSalary = 1000,
        fourthYearSalary = 0,
        bestPaid = false,
        popular = true,
        imageUrl = "https://placehold.co/600x400/png",
        links = "ausbildung.de, fachinformatiker.de",
        published = false,
        publishedDate = Date(),
        updatedDate = Date()
    ),
    AusPage(
        title = " متخصص في تكنولوجيا المعلومات",
        duration = "ثلاث سنوات ونصف",
        certificate = "الثانوية",
        content = "إنها سلسلة من الكلمات اللاتينية التي ، عند وضعها في موضعها ، لا تشكل جملًا بمعنى كامل ، ولكنها تعطي الحياة لنص اختبار مفيد لملء الفراغات التي يتم شغلها لاحقًا من نصوص مخصصة كتبها متخصصون في الاتصال.",
        categoryId = 1,
        userId = 1,
        shiftType = "دوام متغير",
        firstYearSalary = 750,
        secondYearSalary = 800,
        thirdYearSalary = 950,
        fourthYearSalary = 1100,
        bestPaid = false,
        popular = true,
        imageUrl = "https://placehold.co/600x400/png",
        links = "ausbildung.de, fachinformatiker.de",
        published = false,
        publishedDate = Date(),
        updatedDate = Date()
    ),
    AusPage(
        title = " متخصص في تكنولوجيا المعلومات",
        duration = "ثلاث سنوات ونصف",
        certificate = "الثانوية",
        content = "إنها سلسلة من الكلمات اللاتينية التي ، عند وضعها في موضعها ، لا تشكل جملًا بمعنى كامل ، ولكنها تعطي الحياة لنص اختبار مفيد لملء الفراغات التي يتم شغلها لاحقًا من نصوص مخصصة كتبها متخصصون في الاتصال.",
        categoryId = 1,
        userId = 1,
        shiftType = "دوام متغير",
        firstYearSalary = 750,
        secondYearSalary = 800,
        thirdYearSalary = 950,
        fourthYearSalary = 1100,
        bestPaid = false,
        popular = true,
        imageUrl = "https://placehold.co/600x400/png",
        links = "ausbildung.de, fachinformatiker.de",
        published = false,
        publishedDate = Date(),
        updatedDate = Date()
    )
)

@Preview
@Composable
fun FeaturedArticles() {

    Text(
        text = "Featured",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 16.dp)
    )

    Spacer(modifier = Modifier.height(10.dp))

    LazyRow {
        items(ausPages.size) { index ->
            AusPageItem(index)
        }
    }
}

@Composable
fun AusPageItem(index: Int) {
    val ausPage = ausPages[index]
    // add padding end for the last item
    val lastItemPadding = if (index == ausPages.lastIndex) 16.dp else 0.dp

    Box(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp, end = lastItemPadding)
    ) {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .width(250.dp)
                .height(150.dp)
                .clickable { }
                .background(MaterialTheme.colorScheme.onBackground),
            verticalArrangement = Arrangement.SpaceEvenly

        ) {

            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(25.dp))
                    .background(Color.White)
                    .width(100.dp)
                    .height(150.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(model = ausPage.imageUrl),
                    //painter = painterResource(id = R.drawable.ic_mastercard),
                    contentDescription = ausPage.title,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
    }

}
