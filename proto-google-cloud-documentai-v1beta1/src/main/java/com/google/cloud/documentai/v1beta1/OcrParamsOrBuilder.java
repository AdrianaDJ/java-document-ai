/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

public interface OcrParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta1.OcrParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  java.util.List<java.lang.String> getLanguageHintsList();
  /**
   *
   *
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  int getLanguageHintsCount();
  /**
   *
   *
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  java.lang.String getLanguageHints(int index);
  /**
   *
   *
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  com.google.protobuf.ByteString getLanguageHintsBytes(int index);
}
