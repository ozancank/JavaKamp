import React from "react";
import { Form, Formik } from "formik";
import * as Yup from "yup";
import { Button } from "semantic-ui-react";
import KodlamaioTextInput from "../utilities/customFormControls/KodlamaIoTextInput";

export default function ProductAdd() {
  const initialValues = {
    productName: "",
    unitPrice: 10,
  };

  const schema = Yup.object({
    productName: Yup.string().required("Ürün adı zorunlu"),
    unitPrice: Yup.number().required("Ürün fiyatı zorunludur"),
  });

  return (
    <Formik
      initialValues={initialValues}
      validationSchema={schema}
      onSubmit={(values) => {
        console.log(values);
      }}
    >
      <Form className="ui form">
        <KodlamaioTextInput name="productName" placeholder="Ürün adı" />
        <KodlamaioTextInput name="unitPrice" placeholder="Ürün fiyatı" />
        <Button color="green" type="submit">
          Ekle
        </Button>
      </Form>
    </Formik>
  );
}
