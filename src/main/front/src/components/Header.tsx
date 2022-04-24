import React from "react"
import styled from "styled-components"
import {Link} from "react-router-dom";

const HeaderTitle = styled.h1`
  font-size: 1.5em;
  text-align: center;
  color: white;
  background-color: black;
  height: 100px;
  line-height: 100px;
  position: relative;
`;
const AuthMenuWrapper = styled.div`
  position: absolute;
  right: 20px;
  top: 20px;
`;
const AuthMenuUL = styled.ul`
  display: flex;
`;
const AuthMenuLi = styled.li`
  margin-right: 20px;
  &:last-child {
    margin-right: 0;
  }
`;

const AuthMenuLink = styled(Link)`
  color: white;
  text-decoration: none;
  &:hover {
    text-decoration: underline;
  }
`;


export default function Header() {
    return (
        <div>
            <div>
                <HeaderTitle>Welcome To Dev</HeaderTitle>
                <AuthMenuWrapper>
                    <AuthMenuUL>
                        <AuthMenuLi><AuthMenuLink to={'/register'}>회원가입 </AuthMenuLink></AuthMenuLi>
                        <AuthMenuLi><AuthMenuLink to={'/login'}>로그인</AuthMenuLink></AuthMenuLi>
                    </AuthMenuUL>
                </AuthMenuWrapper>
            </div>
        </div>
    )
}
