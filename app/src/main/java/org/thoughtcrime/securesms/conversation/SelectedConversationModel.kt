package org.thoughtcrime.securesms.conversation

import android.graphics.Bitmap
import android.net.Uri

/**
 * Contains information on a single selected conversation item. This is used when transitioning
 * between selected and unselected states.
 */
data class SelectedConversationModel(
  val bitmap: Bitmap,
  val bitmapX: Float,
  val bitmapY: Float,
  val contentX: Float,
  val bubbleWidth: Int,
  val audioUri: Uri? = null,
  val isOutgoing: Boolean,
)