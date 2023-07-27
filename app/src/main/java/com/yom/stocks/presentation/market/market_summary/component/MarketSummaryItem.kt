package com.yom.stocks.presentation.market.market_summary.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yom.stocks.data.remote.dto.summaryModel.ResultModel

@Composable
fun MarketSummaryItem(
    summary: ResultModel?,
    onItemClick: (ResultModel) -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(summary!!) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween


    ) {
//        symbol
//
//        quotetype
//        regularMarketPreviousClose.fmt

//        symbol
//        name
//        price
//        change
//        market cap
//
//                quotetype
//        regularMarketPreviousClose.fmt


        Text(
            text = "${summary?.fullExchangeName} (${summary?.symbol?.substring(1)})",
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Ellipsis

        )

        Text(
            text = "${summary?.regularMarketPreviousClose?.fmt}",
            color = Color.Green,
            modifier = Modifier.align(Alignment.CenterVertically)
        )


    }

}

@Composable
@Preview
fun previewMe() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        MarketSummaryItem(null,{})
    }
}