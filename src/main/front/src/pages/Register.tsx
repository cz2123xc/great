import React from "react";
import styled from "styled-components"

const RegisterWrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: start;
`
const TextInput = styled.input`
  width: 100%;
  height: 40px;
  border-radius: 5px;
  border: 1px solid #ccc;
  padding: 0 10px;
  margin-bottom: 10px;
`

function Register() {
    return (
        <RegisterWrapper>
            <h1>Register</h1>
            <div>
                <label>
                    id:
                    <TextInput type="text" />
                </label>
            </div>
            <div>
                <label>
                    Username:
                    <TextInput type="text" />
                </label>
            </div>
        </RegisterWrapper>
    );
}

export default Register;